.class public final LB/k$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/k;->a(ILmh/l;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/k;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:I


# direct methods
.method constructor <init>(LB/k;Lkotlin/jvm/internal/N;I)V
    .locals 0

    iput-object p1, p0, LB/k$d;->a:LB/k;

    iput-object p2, p0, LB/k$d;->b:Lkotlin/jvm/internal/N;

    iput p3, p0, LB/k$d;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    iget-object v0, p0, LB/k$d;->a:LB/k;

    iget-object v1, p0, LB/k$d;->b:Lkotlin/jvm/internal/N;

    iget-object v1, v1, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v1, LB/j$a;

    iget v2, p0, LB/k$d;->c:I

    invoke-static {v0, v1, v2}, LB/k;->c(LB/k;LB/j$a;I)Z

    move-result v0

    return v0
.end method
