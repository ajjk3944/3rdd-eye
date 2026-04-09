.class public abstract Lw4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:LA4/J;

.field public static final c:LA4/J;

.field public static final d:LA4/J;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw4/k;

    invoke-direct {v0}, Lw4/k;-><init>()V

    invoke-virtual {v0}, Lw4/k;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lw4/o;->a:Ljava/lang/String;

    invoke-static {}, LA4/J;->U()LA4/J;

    move-result-object v0

    sput-object v0, Lw4/o;->b:LA4/J;

    sput-object v0, Lw4/o;->c:LA4/J;

    sput-object v0, Lw4/o;->d:LA4/J;

    :try_start_0
    invoke-static {}, Lw4/o;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 0

    invoke-static {}, Lw4/o;->b()V

    return-void
.end method

.method public static b()V
    .locals 2

    invoke-static {}, Lw4/r;->f()V

    invoke-static {}, Lw4/h;->d()V

    const/4 v0, 0x1

    invoke-static {v0}, Lw4/k;->p(Z)V

    invoke-static {}, Ls4/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lw4/c;->o(Z)V

    return-void
.end method
