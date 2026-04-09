.class abstract LMj/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/util/concurrent/Executor;

.field static final b:LMj/t;

.field static final c:LMj/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const/4 v1, 0x0

    const-string v2, "RoboVM"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "Dalvik"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sput-object v1, LMj/s;->a:Ljava/util/concurrent/Executor;

    new-instance v0, LMj/t$b;

    invoke-direct {v0}, LMj/t$b;-><init>()V

    sput-object v0, LMj/s;->b:LMj/t;

    new-instance v0, LMj/c$a;

    invoke-direct {v0}, LMj/c$a;-><init>()V

    sput-object v0, LMj/s;->c:LMj/c;

    goto :goto_0

    :cond_0
    new-instance v0, LMj/a;

    invoke-direct {v0}, LMj/a;-><init>()V

    sput-object v0, LMj/s;->a:Ljava/util/concurrent/Executor;

    new-instance v0, LMj/t$a;

    invoke-direct {v0}, LMj/t$a;-><init>()V

    sput-object v0, LMj/s;->b:LMj/t;

    new-instance v0, LMj/c$a;

    invoke-direct {v0}, LMj/c$a;-><init>()V

    sput-object v0, LMj/s;->c:LMj/c;

    goto :goto_0

    :cond_1
    sput-object v1, LMj/s;->a:Ljava/util/concurrent/Executor;

    new-instance v0, LMj/t;

    invoke-direct {v0}, LMj/t;-><init>()V

    sput-object v0, LMj/s;->b:LMj/t;

    new-instance v0, LMj/c;

    invoke-direct {v0}, LMj/c;-><init>()V

    sput-object v0, LMj/s;->c:LMj/c;

    :goto_0
    return-void
.end method
