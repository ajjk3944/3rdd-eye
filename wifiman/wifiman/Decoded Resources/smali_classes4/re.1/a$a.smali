.class public final Lre/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lre/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lh9/a;

.field private final b:LS8/c;

.field private final c:I


# direct methods
.method public constructor <init>(Lh9/a;LS8/c;I)V
    .locals 1

    const-string v0, "bssid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "band"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre/a$a;->a:Lh9/a;

    iput-object p2, p0, Lre/a$a;->b:LS8/c;

    iput p3, p0, Lre/a$a;->c:I

    return-void
.end method


# virtual methods
.method public final a()LS8/c;
    .locals 1

    iget-object v0, p0, Lre/a$a;->b:LS8/c;

    return-object v0
.end method

.method public final b()Lh9/a;
    .locals 1

    iget-object v0, p0, Lre/a$a;->a:Lh9/a;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lre/a$a;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lre/a$a;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Lre/a$a;->a:Lh9/a;

    check-cast p1, Lre/a$a;

    iget-object p1, p1, Lre/a$a;->a:Lh9/a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lre/a$a;->a:Lh9/a;

    invoke-virtual {v0}, Lh9/a;->hashCode()I

    move-result v0

    return v0
.end method
