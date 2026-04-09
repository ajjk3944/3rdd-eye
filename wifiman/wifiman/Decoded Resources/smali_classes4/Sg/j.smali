.class public LSg/j;
.super LSg/k;
.source "SourceFile"


# instance fields
.field private c:LSg/b;

.field private d:LSg/b;


# direct methods
.method public constructor <init>(LSg/b;LSg/b;)V
    .locals 1

    invoke-direct {p0}, LSg/k;-><init>()V

    const/16 v0, 0x81

    iput v0, p0, LSg/k;->a:I

    iput-object p1, p0, LSg/j;->c:LSg/b;

    iput-object p2, p0, LSg/j;->d:LSg/b;

    return-void
.end method


# virtual methods
.method c([BI)I
    .locals 2

    iget-object v0, p0, LSg/j;->c:LSg/b;

    invoke-virtual {v0, p1, p2}, LSg/b;->d([BI)I

    move-result v0

    add-int/2addr v0, p2

    iget-object v1, p0, LSg/j;->d:LSg/b;

    invoke-virtual {v1, p1, v0}, LSg/b;->d([BI)I

    move-result p1

    add-int/2addr v0, p1

    sub-int/2addr v0, p2

    return v0
.end method
