.class public final Lli/B$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lli/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lli/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lli/B$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lli/B$a;

    invoke-direct {v0}, Lli/B$a;-><init>()V

    sput-object v0, Lli/B$a;->a:Lli/B$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lpi/d0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
