.class public final Lpd/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpd/q;


# instance fields
.field private final a:LFg/a;

.field private final b:Lgg/i;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string v1, "createDefault(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpd/r;->a:LFg/a;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpd/r;->b:Lgg/i;

    return-void
.end method

.method public static final synthetic c(Lpd/r;)LFg/a;
    .locals 0

    iget-object p0, p0, Lpd/r;->a:LFg/a;

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lpd/r;->b:Lgg/i;

    return-object v0
.end method

.method public b(Z)Lgg/b;
    .locals 1

    new-instance v0, Lpd/r$a;

    invoke-direct {v0, p0, p1}, Lpd/r$a;-><init>(Lpd/r;Z)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
