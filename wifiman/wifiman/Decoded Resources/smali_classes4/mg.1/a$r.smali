.class final enum Lmg/a$r;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "r"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lmg/a$r;

.field public static final enum INSTANCE:Lmg/a$r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmg/a$r;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmg/a$r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmg/a$r;->INSTANCE:Lmg/a$r;

    filled-new-array {v0}, [Lmg/a$r;

    move-result-object v0

    sput-object v0, Lmg/a$r;->$VALUES:[Lmg/a$r;

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

.method public static valueOf(Ljava/lang/String;)Lmg/a$r;
    .locals 1

    const-class v0, Lmg/a$r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmg/a$r;

    return-object p0
.end method

.method public static values()[Lmg/a$r;
    .locals 1

    sget-object v0, Lmg/a$r;->$VALUES:[Lmg/a$r;

    invoke-virtual {v0}, [Lmg/a$r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmg/a$r;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lmg/a$r;->get()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method
