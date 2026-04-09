.class Lli/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lli/K;

.field private final b:Lli/N;

.field private final c:Lkotlin/reflect/jvm/internal/impl/protobuf/n;

.field private final d:Lli/d;

.field private final e:I

.field private final f:LUh/u;


# direct methods
.method public constructor <init>(Lli/K;Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;ILUh/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/H;->a:Lli/K;

    iput-object p2, p0, Lli/H;->b:Lli/N;

    iput-object p3, p0, Lli/H;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    iput-object p4, p0, Lli/H;->d:Lli/d;

    iput p5, p0, Lli/H;->e:I

    iput-object p6, p0, Lli/H;->f:LUh/u;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lli/H;->a:Lli/K;

    iget-object v1, p0, Lli/H;->b:Lli/N;

    iget-object v2, p0, Lli/H;->c:Lkotlin/reflect/jvm/internal/impl/protobuf/n;

    iget-object v3, p0, Lli/H;->d:Lli/d;

    iget v4, p0, Lli/H;->e:I

    iget-object v5, p0, Lli/H;->f:LUh/u;

    invoke-static/range {v0 .. v5}, Lli/K;->f(Lli/K;Lli/N;Lkotlin/reflect/jvm/internal/impl/protobuf/n;Lli/d;ILUh/u;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
