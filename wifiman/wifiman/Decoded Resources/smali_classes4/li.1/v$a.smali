.class public final Lli/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lli/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lli/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lli/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lli/v$a;

    invoke-direct {v0}, Lli/v$a;-><init>()V

    sput-object v0, Lli/v$a;->a:Lli/v$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
