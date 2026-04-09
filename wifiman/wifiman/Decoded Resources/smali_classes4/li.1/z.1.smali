.class public final Lli/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lli/v;


# static fields
.field public static final a:Lli/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lli/z;

    invoke-direct {v0}, Lli/z;-><init>()V

    sput-object v0, Lli/z;->a:Lli/z;

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

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method
