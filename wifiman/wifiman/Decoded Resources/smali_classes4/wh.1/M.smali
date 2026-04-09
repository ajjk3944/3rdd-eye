.class Lwh/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# static fields
.field public static final a:Lwh/M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwh/M;

    invoke-direct {v0}, Lwh/M;-><init>()V

    sput-object v0, Lwh/M;->a:Lwh/M;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lwh/X$a;->o()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method
