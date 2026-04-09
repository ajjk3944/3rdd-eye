.class public final Lwh/E0$a;
.super Lwh/K0$c;
.source "SourceFile"

# interfaces
.implements Lth/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/E0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final j:Lwh/E0;


# direct methods
.method public constructor <init>(Lwh/E0;)V
    .locals 1

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lwh/K0$c;-><init>()V

    iput-object p1, p0, Lwh/E0$a;->j:Lwh/E0;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lth/l;
    .locals 1

    invoke-virtual {p0}, Lwh/E0$a;->k0()Lwh/E0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e0()Lwh/K0;
    .locals 1

    invoke-virtual {p0}, Lwh/E0$a;->k0()Lwh/E0;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwh/E0$a;->k0()Lwh/E0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lwh/E0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k0()Lwh/E0;
    .locals 1

    iget-object v0, p0, Lwh/E0$a;->j:Lwh/E0;

    return-object v0
.end method
