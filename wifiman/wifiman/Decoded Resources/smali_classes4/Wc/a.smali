.class public final LWc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWc/a$a;
    }
.end annotation


# static fields
.field public static final c:LWc/a$a;


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LWc/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LWc/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LWc/a;->c:LWc/a$a;

    return-void
.end method

.method private constructor <init>(Linet/ipaddr/g;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LWc/a;->a:Linet/ipaddr/g;

    .line 4
    iput p2, p0, LWc/a;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Linet/ipaddr/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LWc/a;-><init>(Linet/ipaddr/g;I)V

    return-void
.end method


# virtual methods
.method public final a()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LWc/a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, LWc/a;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LWc/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, LWc/a;->a:Linet/ipaddr/g;

    check-cast p1, LWc/a;

    iget-object v1, p1, LWc/a;->a:Linet/ipaddr/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LWc/a;->b:I

    iget p1, p1, LWc/a;->b:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LWc/a;->a:Linet/ipaddr/g;

    invoke-virtual {v0}, Linet/ipaddr/a;->hashCode()I

    move-result v0

    iget v1, p0, LWc/a;->b:I

    mul-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LWc/a;->a:Linet/ipaddr/g;

    iget v1, p0, LWc/a;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
