.class public abstract LQ9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ9/j;


# instance fields
.field private final a:LLi/y;

.field private final b:LLi/D;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, v1, v0}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object v0

    iput-object v0, p0, LQ9/a;->a:LLi/y;

    invoke-static {v0}, LLi/i;->a(LLi/y;)LLi/D;

    move-result-object v0

    iput-object v0, p0, LQ9/a;->b:LLi/D;

    return-void
.end method


# virtual methods
.method public a()LLi/D;
    .locals 1

    iget-object v0, p0, LQ9/a;->b:LLi/D;

    return-object v0
.end method

.method public b(LQ9/j$a;)V
    .locals 1

    const-string/jumbo v0, "navTarget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ9/a;->a:LLi/y;

    invoke-interface {v0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method
