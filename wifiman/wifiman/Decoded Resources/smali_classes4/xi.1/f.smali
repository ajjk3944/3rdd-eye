.class Lxi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lxi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxi/f;

    invoke-direct {v0}, Lxi/f;-><init>()V

    sput-object v0, Lxi/f;->a:Lxi/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lxi/j;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
