.class final Lzi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/j;


# instance fields
.field private final a:Lmh/a;

.field private final b:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/a;Lmh/l;)V
    .locals 1

    const-string v0, "getInitialValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi/i;->a:Lmh/a;

    iput-object p2, p0, Lzi/i;->b:Lmh/l;

    return-void
.end method

.method public static final synthetic c(Lzi/i;)Lmh/a;
    .locals 0

    iget-object p0, p0, Lzi/i;->a:Lmh/a;

    return-object p0
.end method

.method public static final synthetic d(Lzi/i;)Lmh/l;
    .locals 0

    iget-object p0, p0, Lzi/i;->b:Lmh/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lzi/i$a;

    invoke-direct {v0, p0}, Lzi/i$a;-><init>(Lzi/i;)V

    return-object v0
.end method
