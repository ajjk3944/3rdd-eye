.class public final LP7/c$c;
.super LP7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LP7/c;-><init>()V

    const-string/jumbo v0, "ble_char_read_started"

    iput-object v0, p0, LP7/c$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP7/c$c;->a:Ljava/lang/String;

    return-object v0
.end method
