.class public final LN0/a$a;
.super Landroid/text/SegmentFinder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/a;->a(LN0/f;)Landroid/text/SegmentFinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LN0/f;


# direct methods
.method constructor <init>(LN0/f;)V
    .locals 0

    iput-object p1, p0, LN0/a$a;->a:LN0/f;

    invoke-direct {p0}, Landroid/text/SegmentFinder;-><init>()V

    return-void
.end method


# virtual methods
.method public nextEndBoundary(I)I
    .locals 1

    iget-object v0, p0, LN0/a$a;->a:LN0/f;

    invoke-interface {v0, p1}, LN0/f;->d(I)I

    move-result p1

    return p1
.end method

.method public nextStartBoundary(I)I
    .locals 1

    iget-object v0, p0, LN0/a$a;->a:LN0/f;

    invoke-interface {v0, p1}, LN0/f;->a(I)I

    move-result p1

    return p1
.end method

.method public previousEndBoundary(I)I
    .locals 1

    iget-object v0, p0, LN0/a$a;->a:LN0/f;

    invoke-interface {v0, p1}, LN0/f;->b(I)I

    move-result p1

    return p1
.end method

.method public previousStartBoundary(I)I
    .locals 1

    iget-object v0, p0, LN0/a$a;->a:LN0/f;

    invoke-interface {v0, p1}, LN0/f;->c(I)I

    move-result p1

    return p1
.end method
