.class final Lo/a$b;
.super Lo/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/a;


# direct methods
.method constructor <init>(Lo/a;)V
    .locals 0

    iput-object p1, p0, Lo/a$b;->d:Lo/a;

    invoke-virtual {p1}, Lo/V;->size()I

    move-result p1

    invoke-direct {p0, p1}, Lo/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected d(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo/a$b;->d:Lo/a;

    invoke-virtual {v0, p1}, Lo/V;->h(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected e(I)V
    .locals 1

    iget-object v0, p0, Lo/a$b;->d:Lo/a;

    invoke-virtual {v0, p1}, Lo/V;->j(I)Ljava/lang/Object;

    return-void
.end method
