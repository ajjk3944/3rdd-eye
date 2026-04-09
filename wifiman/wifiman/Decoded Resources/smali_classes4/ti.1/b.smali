.class Lti/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:Lti/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lti/b;

    invoke-direct {v0}, Lti/b;-><init>()V

    sput-object v0, Lti/b;->a:Lti/b;

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

    check-cast p1, Lpi/M0;

    invoke-static {p1}, Lti/c;->a(Lpi/M0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
