.class public abstract LGg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LGg/a$b;,
        LGg/a$h;,
        LGg/a$f;,
        LGg/a$c;,
        LGg/a$e;,
        LGg/a$d;,
        LGg/a$a;,
        LGg/a$g;
    }
.end annotation


# static fields
.field static final a:Lgg/y;

.field static final b:Lgg/y;

.field static final c:Lgg/y;

.field static final d:Lgg/y;

.field static final e:Lgg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LGg/a$h;

    invoke-direct {v0}, LGg/a$h;-><init>()V

    invoke-static {v0}, LEg/a;->j(Lkg/q;)Lgg/y;

    move-result-object v0

    sput-object v0, LGg/a;->a:Lgg/y;

    new-instance v0, LGg/a$b;

    invoke-direct {v0}, LGg/a$b;-><init>()V

    invoke-static {v0}, LEg/a;->g(Lkg/q;)Lgg/y;

    move-result-object v0

    sput-object v0, LGg/a;->b:Lgg/y;

    new-instance v0, LGg/a$c;

    invoke-direct {v0}, LGg/a$c;-><init>()V

    invoke-static {v0}, LEg/a;->h(Lkg/q;)Lgg/y;

    move-result-object v0

    sput-object v0, LGg/a;->c:Lgg/y;

    invoke-static {}, Lwg/p;->i()Lwg/p;

    move-result-object v0

    sput-object v0, LGg/a;->d:Lgg/y;

    new-instance v0, LGg/a$f;

    invoke-direct {v0}, LGg/a$f;-><init>()V

    invoke-static {v0}, LEg/a;->i(Lkg/q;)Lgg/y;

    move-result-object v0

    sput-object v0, LGg/a;->e:Lgg/y;

    return-void
.end method

.method public static a()Lgg/y;
    .locals 1

    sget-object v0, LGg/a;->b:Lgg/y;

    invoke-static {v0}, LEg/a;->u(Lgg/y;)Lgg/y;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/util/concurrent/Executor;)Lgg/y;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, v0}, LGg/a;->c(Ljava/util/concurrent/Executor;ZZ)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/util/concurrent/Executor;ZZ)Lgg/y;
    .locals 0

    invoke-static {p0, p1, p2}, LEg/a;->e(Ljava/util/concurrent/Executor;ZZ)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method public static d()Lgg/y;
    .locals 1

    sget-object v0, LGg/a;->c:Lgg/y;

    invoke-static {v0}, LEg/a;->w(Lgg/y;)Lgg/y;

    move-result-object v0

    return-object v0
.end method

.method public static e()Lgg/y;
    .locals 1

    sget-object v0, LGg/a;->a:Lgg/y;

    invoke-static {v0}, LEg/a;->y(Lgg/y;)Lgg/y;

    move-result-object v0

    return-object v0
.end method

.method public static f()Lgg/y;
    .locals 1

    sget-object v0, LGg/a;->d:Lgg/y;

    return-object v0
.end method
