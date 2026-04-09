.class LNh/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LNh/U;

.field private final b:LQh/n;

.field private final c:Lkotlin/jvm/internal/N;


# direct methods
.method public constructor <init>(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNh/I;->a:LNh/U;

    iput-object p2, p0, LNh/I;->b:LQh/n;

    iput-object p3, p0, LNh/I;->c:Lkotlin/jvm/internal/N;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LNh/I;->a:LNh/U;

    iget-object v1, p0, LNh/I;->b:LQh/n;

    iget-object v2, p0, LNh/I;->c:Lkotlin/jvm/internal/N;

    invoke-static {v0, v1, v2}, LNh/U;->j(LNh/U;LQh/n;Lkotlin/jvm/internal/N;)Loi/j;

    move-result-object v0

    return-object v0
.end method
