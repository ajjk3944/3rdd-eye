.class final Lo/b$a;
.super Lo/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lo/b;


# direct methods
.method public constructor <init>(Lo/b;)V
    .locals 0

    iput-object p1, p0, Lo/b$a;->d:Lo/b;

    invoke-virtual {p1}, Lo/b;->i()I

    move-result p1

    invoke-direct {p0, p1}, Lo/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected d(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo/b$a;->d:Lo/b;

    invoke-virtual {v0, p1}, Lo/b;->u(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected e(I)V
    .locals 1

    iget-object v0, p0, Lo/b$a;->d:Lo/b;

    invoke-virtual {v0, p1}, Lo/b;->j(I)Ljava/lang/Object;

    return-void
.end method
