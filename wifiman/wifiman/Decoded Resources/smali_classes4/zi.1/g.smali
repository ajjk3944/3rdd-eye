.class public final Lzi/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# instance fields
.field private final a:Lzi/j;

.field private final b:Z

.field private final c:Lmh/l;


# direct methods
.method public constructor <init>(Lzi/j;ZLmh/l;)V
    .locals 1

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predicate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi/g;->a:Lzi/j;

    iput-boolean p2, p0, Lzi/g;->b:Z

    iput-object p3, p0, Lzi/g;->c:Lmh/l;

    return-void
.end method

.method public static final synthetic c(Lzi/g;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lzi/g;->c:Lmh/l;

    return-object p0
.end method

.method public static final synthetic d(Lzi/g;)Z
    .locals 0

    iget-boolean p0, p0, Lzi/g;->b:Z

    return p0
.end method

.method public static final synthetic e(Lzi/g;)Lzi/j;
    .locals 0

    iget-object p0, p0, Lzi/g;->a:Lzi/j;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lzi/g$a;

    invoke-direct {v0, p0}, Lzi/g$a;-><init>(Lzi/g;)V

    return-object v0
.end method
