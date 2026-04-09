.class final Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/protobuf/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field final a:Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;

.field final b:I

.field final c:Lkotlin/reflect/jvm/internal/impl/protobuf/v$b;

.field final d:Z

.field final e:Z


# direct methods
.method constructor <init>(Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;ILkotlin/reflect/jvm/internal/impl/protobuf/v$b;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;

    iput p2, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->b:I

    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/v$b;

    iput-boolean p4, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->d:Z

    iput-boolean p5, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->e:Z

    return-void
.end method


# virtual methods
.method public F(Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;Lkotlin/reflect/jvm/internal/impl/protobuf/n;)Lkotlin/reflect/jvm/internal/impl/protobuf/n$a;
    .locals 0

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    check-cast p2, Lkotlin/reflect/jvm/internal/impl/protobuf/h;

    invoke-virtual {p1, p2}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;->f(Lkotlin/reflect/jvm/internal/impl/protobuf/h;)Lkotlin/reflect/jvm/internal/impl/protobuf/h$b;

    move-result-object p1

    return-object p1
.end method

.method public M0()Lkotlin/reflect/jvm/internal/impl/protobuf/v$c;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/v$b;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/v$b;->getJavaType()Lkotlin/reflect/jvm/internal/impl/protobuf/v$c;

    move-result-object v0

    return-object v0
.end method

.method public a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;)I
    .locals 1

    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->b:I

    iget p1, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public b()Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->a:Lkotlin/reflect/jvm/internal/impl/protobuf/i$b;

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;)I

    move-result p1

    return p1
.end method

.method public getNumber()I
    .locals 1

    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->b:I

    return v0
.end method

.method public isPacked()Z
    .locals 1

    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->e:Z

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->d:Z

    return v0
.end method

.method public o()Lkotlin/reflect/jvm/internal/impl/protobuf/v$b;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/protobuf/h$e;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/v$b;

    return-object v0
.end method
