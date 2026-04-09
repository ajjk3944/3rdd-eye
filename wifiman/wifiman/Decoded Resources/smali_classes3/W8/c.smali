.class public final LW8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT8/c;


# instance fields
.field private final a:Lgg/i;


# direct methods
.method public constructor <init>(LG6/G;)V
    .locals 2

    const-string/jumbo v0, "rxBleClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LQ6/g$b;

    invoke-direct {v0}, LQ6/g$b;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, LQ6/g$b;->b(I)LQ6/g$b;

    move-result-object v0

    invoke-virtual {v0}, LQ6/g$b;->a()LQ6/g;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [LQ6/d;

    invoke-virtual {p1, v0, v1}, LG6/G;->e(LQ6/g;[LQ6/d;)Lgg/s;

    move-result-object p1

    sget-object v0, Lcom/ui/btle/rxandroidble/a$a;->a:Lcom/ui/btle/rxandroidble/a$a;

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/a$a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {p1, v1}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object p1

    sget-object v1, LW8/c$a;->a:LW8/c$a;

    invoke-virtual {p1, v1}, Lgg/s;->W(Lkg/n;)Lgg/s;

    move-result-object p1

    sget-object v1, LW8/c$b;->a:LW8/c$b;

    invoke-virtual {p1, v1}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    sget-object v1, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {p1, v1}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    sget-object v1, LW8/c$c;->a:LW8/c$c;

    invoke-virtual {p1, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance v1, LW8/b;

    invoke-direct {v1}, LW8/b;-><init>()V

    invoke-virtual {p1, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/a$a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    sget-object v0, LW8/c$e;->a:LW8/c$e;

    invoke-virtual {p1, v0}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "rxBleClient.scanBleDevic\u2026)\n            .refCount()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LW8/c;->a:Lgg/i;

    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, LW8/c;->b()V

    return-void
.end method

.method private static final b()V
    .locals 1

    sget-object v0, LW8/c$d;->a:LW8/c$d;

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    return-void
.end method
