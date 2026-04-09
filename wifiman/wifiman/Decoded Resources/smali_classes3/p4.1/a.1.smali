.class public abstract Lp4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;

.field public static final i:LA4/J;

.field public static final j:LA4/J;

.field public static final k:LA4/J;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp4/e;

    invoke-direct {v0}, Lp4/e;-><init>()V

    invoke-virtual {v0}, Lp4/e;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp4/a;->a:Ljava/lang/String;

    new-instance v0, Lp4/p;

    invoke-direct {v0}, Lp4/p;-><init>()V

    invoke-virtual {v0}, Lp4/p;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp4/a;->b:Ljava/lang/String;

    new-instance v0, Lp4/u;

    invoke-direct {v0}, Lp4/u;-><init>()V

    invoke-virtual {v0}, Lp4/u;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp4/a;->c:Ljava/lang/String;

    new-instance v0, Lp4/h;

    invoke-direct {v0}, Lp4/h;-><init>()V

    invoke-virtual {v0}, Lp4/h;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp4/a;->d:Ljava/lang/String;

    new-instance v0, Lp4/D;

    invoke-direct {v0}, Lp4/D;-><init>()V

    invoke-virtual {v0}, Lp4/D;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp4/a;->e:Ljava/lang/String;

    new-instance v0, Lp4/F;

    invoke-direct {v0}, Lp4/F;-><init>()V

    invoke-virtual {v0}, Lp4/F;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp4/a;->f:Ljava/lang/String;

    new-instance v0, Lp4/z;

    invoke-direct {v0}, Lp4/z;-><init>()V

    invoke-virtual {v0}, Lp4/z;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp4/a;->g:Ljava/lang/String;

    new-instance v0, Lp4/H;

    invoke-direct {v0}, Lp4/H;-><init>()V

    invoke-virtual {v0}, Lp4/H;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lp4/a;->h:Ljava/lang/String;

    invoke-static {}, LA4/J;->U()LA4/J;

    move-result-object v0

    sput-object v0, Lp4/a;->i:LA4/J;

    sput-object v0, Lp4/a;->j:LA4/J;

    sput-object v0, Lp4/a;->k:LA4/J;

    :try_start_0
    invoke-static {}, Lp4/a;->a()V
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

    invoke-static {}, Lp4/a;->b()V

    return-void
.end method

.method public static b()V
    .locals 2

    invoke-static {}, Lp4/d;->e()V

    invoke-static {}, Lw4/o;->b()V

    const/4 v0, 0x1

    invoke-static {v0}, Lp4/e;->p(Z)V

    invoke-static {v0}, Lp4/p;->o(Z)V

    invoke-static {}, Ls4/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lp4/h;->o(Z)V

    invoke-static {v0}, Lp4/u;->p(Z)V

    invoke-static {v0}, Lp4/z;->m(Z)V

    invoke-static {v0}, Lp4/D;->m(Z)V

    invoke-static {v0}, Lp4/F;->m(Z)V

    invoke-static {v0}, Lp4/H;->m(Z)V

    return-void
.end method
