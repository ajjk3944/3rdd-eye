.class Ldi/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Ldi/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldi/p;

    invoke-direct {v0}, Ldi/p;-><init>()V

    sput-object v0, Ldi/p;->a:Ldi/p;

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

    check-cast p1, Lpi/S;

    invoke-static {p1}, Ldi/q;->i(Lpi/S;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
