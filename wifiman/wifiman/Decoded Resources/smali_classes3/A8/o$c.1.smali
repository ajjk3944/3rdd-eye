.class final LA8/o$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA8/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA8/o$c$a;
    }
.end annotation


# static fields
.field public static final c:LA8/o$c$a;

.field private static final d:LA8/o$c;


# instance fields
.field private final a:LS8/l;

.field private final b:Lh9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA8/o$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA8/o$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LA8/o$c;->c:LA8/o$c$a;

    new-instance v0, LA8/o$c;

    invoke-direct {v0, v1, v1}, LA8/o$c;-><init>(LS8/l;Lh9/a;)V

    sput-object v0, LA8/o$c;->d:LA8/o$c;

    return-void
.end method

.method public constructor <init>(LS8/l;Lh9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA8/o$c;->a:LS8/l;

    iput-object p2, p0, LA8/o$c;->b:Lh9/a;

    return-void
.end method

.method public static final synthetic a()LA8/o$c;
    .locals 1

    sget-object v0, LA8/o$c;->d:LA8/o$c;

    return-object v0
.end method


# virtual methods
.method public final b()Lh9/a;
    .locals 1

    iget-object v0, p0, LA8/o$c;->b:Lh9/a;

    return-object v0
.end method

.method public final c()LS8/l;
    .locals 1

    iget-object v0, p0, LA8/o$c;->a:LS8/l;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LA8/o$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LA8/o$c;

    iget-object v1, p0, LA8/o$c;->a:LS8/l;

    iget-object v3, p1, LA8/o$c;->a:LS8/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LA8/o$c;->b:Lh9/a;

    iget-object p1, p1, LA8/o$c;->b:Lh9/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LA8/o$c;->a:LS8/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LS8/l;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LA8/o$c;->b:Lh9/a;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lh9/a;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LA8/o$c;->a:LS8/l;

    iget-object v1, p0, LA8/o$c;->b:Lh9/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "SignalState(signal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", apBssid="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
