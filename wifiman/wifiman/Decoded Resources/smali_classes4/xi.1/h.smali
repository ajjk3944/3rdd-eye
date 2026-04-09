.class Lxi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# static fields
.field public static final a:Lxi/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxi/h;

    invoke-direct {v0}, Lxi/h;-><init>()V

    sput-object v0, Lxi/h;->a:Lxi/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Lxi/j;->i(Ljava/lang/Object;Ljava/lang/Object;)LYg/J;

    move-result-object p1

    return-object p1
.end method
