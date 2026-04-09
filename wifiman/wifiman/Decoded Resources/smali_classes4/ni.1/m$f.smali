.class final synthetic Lni/m$f;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lni/m;-><init>(Lli/p;LUh/c;LWh/c;LWh/a;LBh/g0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lkotlin/jvm/internal/o;-><init>(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lni/m$a;
    .locals 2

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lni/m$a;

    iget-object v1, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v1, Lni/m;

    invoke-direct {v0, v1, p1}, Lni/m$a;-><init>(Lni/m;Lkotlin/reflect/jvm/internal/impl/types/checker/g;)V

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "<init>"

    return-object v0
.end method

.method public final getOwner()Lth/f;
    .locals 1

    const-class v0, Lni/m$a;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V"

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/checker/g;

    invoke-virtual {p0, p1}, Lni/m$f;->a(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lni/m$a;

    move-result-object p1

    return-object p1
.end method
