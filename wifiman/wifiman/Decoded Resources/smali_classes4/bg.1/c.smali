.class public final synthetic Lbg/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntUnaryOperator;


# instance fields
.field public final synthetic a:LZf/c;


# direct methods
.method public synthetic constructor <init>(LZf/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg/c;->a:LZf/c;

    return-void
.end method


# virtual methods
.method public final applyAsInt(I)I
    .locals 1

    iget-object v0, p0, Lbg/c;->a:LZf/c;

    invoke-static {v0, p1}, Lbg/d;->h1(LZf/c;I)I

    move-result p1

    return p1
.end method
