package edu.hfut.wangyu.dal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public class Result<T> {

        /**
         * 参数错误
         */
        public static final int RESULT_CODE_CHECK_FAILED = 510;
        public static final int RESULT_CODE_SUCCESS = 200;
        public static final int RESULT_CODE_FAIL = 500;
        public static final int RESULT_CODE_NOT_FOUND = 404;
        public static final int RESULT_CODE_NO_PERMISSION = 403;

        public static final String RESULT_MESSAGE_SYS_ERROR = "系统错误";
        public static final String RESULT_MESSAGE_SYS_SUCCESS = "操作成功";

        /**
         * 返回码
         */
        private Integer resultCode;
        /**
         * 返回信息提示
         */
        private String msg;
        /**
         * 返回的数据
         */
        private T data;

        public static <T> Result<T> createSuccess(String msg, T data) {
            return new Result<T>(RESULT_CODE_SUCCESS, msg, data);
        }

        public static <T> Result<T> createSuccess(String msg) {
            return new Result<T>(RESULT_CODE_SUCCESS, msg, null);
        }

        public static <T> Result<T> createSuccess() {
            return new Result<T>(RESULT_CODE_SUCCESS, RESULT_MESSAGE_SYS_SUCCESS, null);
        }

        public static <T> Result<T> createFailed(String msg) {
            return new Result<T>(RESULT_CODE_FAIL, msg, null);
        }

        public static <T> Result<T> createFailed() {
            return new Result<T>(RESULT_CODE_FAIL, RESULT_MESSAGE_SYS_ERROR, null);
        }

        public static <T> Result<T> createNotFound(String msg) {
            return new Result<T>(RESULT_CODE_NOT_FOUND, msg, null);
        }

        public static <T> Result<T> createCheckFailed(String msg) {
            return new Result<T>(RESULT_CODE_CHECK_FAILED, msg, null);
        }

        public static <T> Result<T> createNoPermission(String msg) {
            return new Result<T>(RESULT_CODE_NO_PERMISSION, msg, null);
        }

}
