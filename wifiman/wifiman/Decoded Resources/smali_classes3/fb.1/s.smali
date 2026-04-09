.class public final Lfb/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LGb/f;

.field private c:LGb/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;LGb/f;)V
    .locals 1

    const-string/jumbo v0, "macAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/s;->a:Ljava/lang/String;

    iput-object p2, p0, Lfb/s;->b:LGb/f;

    return-void
.end method

.method private final b()LGb/b;
    .locals 4

    iget-object v0, p0, Lfb/s;->b:LGb/f;

    invoke-interface {v0}, LGb/f;->E()LGb/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LGb/b;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lfb/s;->a:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfb/s;->c:LGb/b;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lfb/s;->b()LGb/b;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LGb/b;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfb/s;->c:LGb/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LGb/b;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lfb/s;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lfb/s;->c:LGb/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LGb/b;->b()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    new-instance v0, LGb/b;

    iget-object v1, p0, Lfb/s;->a:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, LGb/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lfb/s;->c:LGb/b;

    iget-object p1, p0, Lfb/s;->b:LGb/f;

    invoke-interface {p1, v0}, LGb/f;->i(LGb/b;)V

    return-void
.end method
