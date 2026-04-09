.class final LF/m0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->c([Ljava/lang/Object;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/m0;

.field final synthetic b:[Ljava/lang/Object;

.field final synthetic c:Lmh/l;

.field final synthetic d:I


# direct methods
.method constructor <init>(LF/m0;[Ljava/lang/Object;Lmh/l;I)V
    .locals 0

    iput-object p1, p0, LF/m0$g;->a:LF/m0;

    iput-object p2, p0, LF/m0$g;->b:[Ljava/lang/Object;

    iput-object p3, p0, LF/m0$g;->c:Lmh/l;

    iput p4, p0, LF/m0$g;->d:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 3

    iget-object p2, p0, LF/m0$g;->a:LF/m0;

    iget-object v0, p0, LF/m0$g;->b:[Ljava/lang/Object;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LF/m0$g;->c:Lmh/l;

    iget v2, p0, LF/m0$g;->d:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, LT/L0;->a(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, LF/m0;->d(LF/m0;[Ljava/lang/Object;Lmh/l;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/m0$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
