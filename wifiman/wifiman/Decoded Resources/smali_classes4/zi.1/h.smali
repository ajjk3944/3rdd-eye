.class public final Lzi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# instance fields
.field private final a:Lzi/j;

.field private final b:Lmh/l;

.field private final c:Lmh/l;


# direct methods
.method public constructor <init>(Lzi/j;Lmh/l;Lmh/l;)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iterator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi/h;->a:Lzi/j;

    iput-object p2, p0, Lzi/h;->b:Lmh/l;

    iput-object p3, p0, Lzi/h;->c:Lmh/l;

    return-void
.end method

.method public static final synthetic c(Lzi/h;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lzi/h;->c:Lmh/l;

    return-object p0
.end method

.method public static final synthetic d(Lzi/h;)Lzi/j;
    .locals 0

    iget-object p0, p0, Lzi/h;->a:Lzi/j;

    return-object p0
.end method

.method public static final synthetic e(Lzi/h;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lzi/h;->b:Lmh/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lzi/h$a;

    invoke-direct {v0, p0}, Lzi/h$a;-><init>(Lzi/h;)V

    return-object v0
.end method
