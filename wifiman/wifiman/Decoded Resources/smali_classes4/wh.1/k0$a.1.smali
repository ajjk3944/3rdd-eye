.class public final Lwh/k0$a;
.super Lwh/K0$d;
.source "SourceFile"

# interfaces
.implements Lth/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final j:Lwh/k0;


# direct methods
.method public constructor <init>(Lwh/k0;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwh/K0$d;-><init>()V

    iput-object p1, p0, Lwh/k0$a;->j:Lwh/k0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lth/l;
    .locals 1

    invoke-virtual {p0}, Lwh/k0$a;->k0()Lwh/k0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e0()Lwh/K0;
    .locals 1

    invoke-virtual {p0}, Lwh/k0$a;->k0()Lwh/k0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lwh/k0$a;->l0(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public k0()Lwh/k0;
    .locals 1

    iget-object v0, p0, Lwh/k0$a;->j:Lwh/k0;

    return-object v0
.end method

.method public l0(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lwh/k0$a;->k0()Lwh/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lwh/k0;->set(Ljava/lang/Object;)V

    return-void
.end method
