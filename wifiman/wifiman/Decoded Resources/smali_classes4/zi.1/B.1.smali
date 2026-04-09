.class public final Lzi/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# instance fields
.field private final a:Lzi/j;

.field private final b:Lmh/l;


# direct methods
.method public constructor <init>(Lzi/j;Lmh/l;)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi/B;->a:Lzi/j;

    iput-object p2, p0, Lzi/B;->b:Lmh/l;

    return-void
.end method

.method public static final synthetic c(Lzi/B;)Lzi/j;
    .locals 0

    iget-object p0, p0, Lzi/B;->a:Lzi/j;

    return-object p0
.end method

.method public static final synthetic d(Lzi/B;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lzi/B;->b:Lmh/l;

    return-object p0
.end method


# virtual methods
.method public final e(Lmh/l;)Lzi/j;
    .locals 3

    const-string v0, "iterator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzi/h;

    iget-object v1, p0, Lzi/B;->a:Lzi/j;

    iget-object v2, p0, Lzi/B;->b:Lmh/l;

    invoke-direct {v0, v1, v2, p1}, Lzi/h;-><init>(Lzi/j;Lmh/l;Lmh/l;)V

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lzi/B$a;

    invoke-direct {v0, p0}, Lzi/B$a;-><init>(Lzi/B;)V

    return-object v0
.end method
