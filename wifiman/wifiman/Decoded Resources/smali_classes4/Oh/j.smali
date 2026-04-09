.class LOh/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LOh/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LOh/j;

    invoke-direct {v0}, LOh/j;-><init>()V

    sput-object v0, LOh/j;->a:LOh/j;

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

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, LOh/k;->Y0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
