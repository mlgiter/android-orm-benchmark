package com.littleinc.orm_benchmark;

import com.littleinc.orm_benchmark.greendao.GreenDaoExecutor;
import com.littleinc.orm_benchmark.ormlite.ORMLiteExecutor;
import com.littleinc.orm_benchmark.sqlite.SQLiteExecutor;
import com.littleinc.orm_benchmark.sqlite.SQLiteExecutorFast;

public class Application extends android.app.Application {

    private static final boolean USE_IN_MEMORY_DB = false;

    @Override
    public void onCreate() {
        super.onCreate();

        SQLiteExecutor.INSTANCE.init(this, USE_IN_MEMORY_DB);
        SQLiteExecutorFast.INSTANCE.init(this, USE_IN_MEMORY_DB);
        ORMLiteExecutor.INSTANCE.init(this, USE_IN_MEMORY_DB);
        GreenDaoExecutor.INSTANCE.init(this, USE_IN_MEMORY_DB);
    }
}
