.class public final Lrb/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/g$a;,
        Lrb/g$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 %2\u00020\u0001:\u0002\u001e\u0013B5\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lrb/g;",
        "",
        "",
        "seen0",
        "",
        "Lrb/f;",
        "traces",
        "Lrb/a;",
        "meta",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILjava/util/List;Lrb/a;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "b",
        "(Lrb/g;LYi/d;LXi/f;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Ljava/util/List;",
        "getTraces",
        "()Ljava/util/List;",
        "Lrb/a;",
        "getMeta",
        "()Lrb/a;",
        "Companion",
        "unificore_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lrb/g$b;

.field private static final c:[LVi/b;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Lrb/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lrb/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/g$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrb/g;->Companion:Lrb/g$b;

    new-instance v0, LZi/f;

    sget-object v2, Lrb/f;->Companion:Lrb/f$a;

    invoke-virtual {v2}, Lrb/f$a;->serializer()LVi/b;

    move-result-object v2

    invoke-direct {v0, v2}, LZi/f;-><init>(LVi/b;)V

    const/4 v2, 0x2

    new-array v2, v2, [LVi/b;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lrb/g;->c:[LVi/b;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lrb/a;LZi/R0;)V
    .locals 1

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    sget-object p4, Lrb/g$a;->a:Lrb/g$a;

    invoke-virtual {p4}, Lrb/g$a;->a()LXi/f;

    move-result-object p4

    invoke-static {p1, v0, p4}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrb/g;->a:Ljava/util/List;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    new-instance p1, Lrb/a;

    const-wide/16 p2, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p2, p3, v0, p4}, Lrb/a;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lrb/g;->b:Lrb/a;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lrb/g;->b:Lrb/a;

    :goto_0
    return-void
.end method

.method public static final synthetic a()[LVi/b;
    .locals 1

    sget-object v0, Lrb/g;->c:[LVi/b;

    return-object v0
.end method

.method public static final synthetic b(Lrb/g;LYi/d;LXi/f;)V
    .locals 6

    sget-object v0, Lrb/g;->c:[LVi/b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v2, p0, Lrb/g;->a:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lrb/g;->b:Lrb/a;

    new-instance v2, Lrb/a;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v0, v5}, Lrb/a;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    sget-object v1, Lrb/a$a;->a:Lrb/a$a;

    iget-object p0, p0, Lrb/g;->b:Lrb/a;

    invoke-interface {p1, p2, v0, v1, p0}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lrb/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lrb/g;

    iget-object v1, p0, Lrb/g;->a:Ljava/util/List;

    iget-object v3, p1, Lrb/g;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lrb/g;->b:Lrb/a;

    iget-object p1, p1, Lrb/g;->b:Lrb/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lrb/g;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrb/g;->b:Lrb/a;

    invoke-virtual {v1}, Lrb/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lrb/g;->a:Ljava/util/List;

    iget-object v1, p0, Lrb/g;->b:Lrb/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "TracesBody(traces="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", meta="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
