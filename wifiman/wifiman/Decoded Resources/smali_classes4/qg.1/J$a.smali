.class public final enum Lqg/J$a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqg/J$a;

.field public static final enum INSTANCE:Lqg/J$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqg/J$a;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqg/J$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqg/J$a;->INSTANCE:Lqg/J$a;

    filled-new-array {v0}, [Lqg/J$a;

    move-result-object v0

    sput-object v0, Lqg/J$a;->$VALUES:[Lqg/J$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqg/J$a;
    .locals 1

    const-class v0, Lqg/J$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqg/J$a;

    return-object p0
.end method

.method public static values()[Lqg/J$a;
    .locals 1

    sget-object v0, Lqg/J$a;->$VALUES:[Lqg/J$a;

    invoke-virtual {v0}, [Lqg/J$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/J$a;

    return-object v0
.end method


# virtual methods
.method public accept(LDj/c;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 2
    invoke-interface {p1, v0, v1}, LDj/c;->request(J)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    check-cast p1, LDj/c;

    invoke-virtual {p0, p1}, Lqg/J$a;->accept(LDj/c;)V

    return-void
.end method
