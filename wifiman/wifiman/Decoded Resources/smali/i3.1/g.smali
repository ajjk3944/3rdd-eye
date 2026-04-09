.class public final Li3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/b;


# instance fields
.field private final a:LJg/a;


# direct methods
.method public constructor <init>(LJg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/g;->a:LJg/a;

    return-void
.end method

.method public static a(Lm3/a;)Lj3/f;
    .locals 0

    invoke-static {p0}, Li3/f;->a(Lm3/a;)Lj3/f;

    move-result-object p0

    invoke-static {p0}, Le3/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj3/f;

    return-object p0
.end method

.method public static b(LJg/a;)Li3/g;
    .locals 1

    new-instance v0, Li3/g;

    invoke-direct {v0, p0}, Li3/g;-><init>(LJg/a;)V

    return-object v0
.end method


# virtual methods
.method public c()Lj3/f;
    .locals 1

    iget-object v0, p0, Li3/g;->a:LJg/a;

    invoke-interface {v0}, LJg/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm3/a;

    invoke-static {v0}, Li3/g;->a(Lm3/a;)Lj3/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li3/g;->c()Lj3/f;

    move-result-object v0

    return-object v0
.end method
