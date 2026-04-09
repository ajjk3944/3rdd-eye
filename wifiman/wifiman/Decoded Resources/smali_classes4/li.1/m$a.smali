.class public final Lli/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lli/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lli/m$a;

.field private static final b:Lli/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lli/m$a;

    invoke-direct {v0}, Lli/m$a;-><init>()V

    sput-object v0, Lli/m$a;->a:Lli/m$a;

    new-instance v0, Lli/m$a$a;

    invoke-direct {v0}, Lli/m$a$a;-><init>()V

    sput-object v0, Lli/m$a;->b:Lli/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lli/m;
    .locals 1

    sget-object v0, Lli/m$a;->b:Lli/m;

    return-object v0
.end method
