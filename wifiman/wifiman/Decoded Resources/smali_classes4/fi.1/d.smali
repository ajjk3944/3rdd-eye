.class Lfi/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lfi/d;->a:Z

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lfi/d;->a:Z

    check-cast p1, LBh/b;

    invoke-static {v0, p1}, Lfi/e;->e(ZLBh/b;)Lzi/j;

    move-result-object p1

    return-object p1
.end method
