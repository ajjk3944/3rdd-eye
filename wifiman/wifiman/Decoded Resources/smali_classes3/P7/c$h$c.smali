.class public final LP7/c$h$c;
.super LP7/c$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP7/c$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LP7/c$h;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string/jumbo v0, "result_share"

    iput-object v0, p0, LP7/c$h$c;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP7/c$h$c;->c:Ljava/lang/String;

    return-object v0
.end method
