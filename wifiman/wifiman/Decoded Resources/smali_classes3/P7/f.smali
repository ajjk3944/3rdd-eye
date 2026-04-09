.class public final LP7/f;
.super LP7/c;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LP7/c;-><init>()V

    const-string/jumbo v0, "wifiman_api_available_uisp"

    iput-object v0, p0, LP7/f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LP7/f;->a:Ljava/lang/String;

    return-object v0
.end method
