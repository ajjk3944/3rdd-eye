.class public abstract LP7/c$g;
.super LP7/c$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP7/c$g$a;,
        LP7/c$g$b;,
        LP7/c$g$c;,
        LP7/c$g$d;
    }
.end annotation


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, LP7/c$e;-><init>()V

    .line 3
    const-string/jumbo v0, "signal_mapper_floorplan"

    iput-object v0, p0, LP7/c$g;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LP7/c$g;-><init>()V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP7/c$g;->b:Ljava/lang/String;

    return-object v0
.end method
