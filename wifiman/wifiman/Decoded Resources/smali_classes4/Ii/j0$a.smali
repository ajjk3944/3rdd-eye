.class final LIi/j0$a;
.super LIi/j0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final c:LIi/n;

.field final synthetic d:LIi/j0;


# direct methods
.method public constructor <init>(LIi/j0;JLIi/n;)V
    .locals 0

    iput-object p1, p0, LIi/j0$a;->d:LIi/j0;

    invoke-direct {p0, p2, p3}, LIi/j0$c;-><init>(J)V

    iput-object p4, p0, LIi/j0$a;->c:LIi/n;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LIi/j0$a;->c:LIi/n;

    iget-object v1, p0, LIi/j0$a;->d:LIi/j0;

    sget-object v2, LYg/J;->a:LYg/J;

    invoke-interface {v0, v1, v2}, LIi/n;->J(LIi/J;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LIi/j0$c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LIi/j0$a;->c:LIi/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
