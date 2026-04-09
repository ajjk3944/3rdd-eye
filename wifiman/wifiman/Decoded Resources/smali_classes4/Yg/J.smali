.class public final LYg/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LYg/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYg/J;

    invoke-direct {v0}, LYg/J;-><init>()V

    sput-object v0, LYg/J;->a:LYg/J;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Unit"

    return-object v0
.end method
