.class public final Lo/I$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/I$a;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:I

.field private final b:Ljava/util/Iterator;

.field final synthetic c:Lo/I;


# direct methods
.method constructor <init>(Lo/I;)V
    .locals 2

    iput-object p1, p0, Lo/I$a$a;->c:Lo/I;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lo/I$a$a;->a:I

    new-instance v0, Lo/I$a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lo/I$a$a$a;-><init>(Lo/I;Lo/I$a$a;Ldh/e;)V

    invoke-static {v0}, Lzi/m;->a(Lmh/p;)Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lo/I$a$a;->b:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 0

    iput p1, p0, Lo/I$a$a;->a:I

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lo/I$a$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo/I$a$a;->b:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    iget v0, p0, Lo/I$a$a;->a:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lo/I$a$a;->c:Lo/I;

    invoke-virtual {v2, v0}, Lo/I;->y(I)V

    iput v1, p0, Lo/I$a$a;->a:I

    :cond_0
    return-void
.end method
