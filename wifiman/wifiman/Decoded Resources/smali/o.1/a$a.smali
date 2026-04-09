.class final Lo/a$a;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lo/a;


# direct methods
.method constructor <init>(Lo/a;)V
    .locals 0

    iput-object p1, p0, Lo/a$a;->a:Lo/a;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lo/a$d;

    iget-object v1, p0, Lo/a$a;->a:Lo/a;

    invoke-direct {v0, v1}, Lo/a$d;-><init>(Lo/a;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lo/a$a;->a:Lo/a;

    invoke-virtual {v0}, Lo/V;->size()I

    move-result v0

    return v0
.end method
