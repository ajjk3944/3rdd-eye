.class public final LR0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LR0/l;)V
    .locals 0

    invoke-virtual {p1}, LR0/l;->a()V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, LR0/n;

    return p1
.end method

.method public hashCode()I
    .locals 1

    const-class v0, LR0/n;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "FinishComposingTextCommand()"

    return-object v0
.end method
