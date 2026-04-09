.class final Ln8/a$w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a$w;->a(LJe/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/a$w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$w$a;

    invoke-direct {v0}, Ln8/a$w$a;-><init>()V

    sput-object v0, Ln8/a$w$a;->a:Ln8/a$w$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)LJe/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LJe/a$b;->a:LJe/a$b;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Ln8/a$w$a;->a(Ljava/lang/Long;)LJe/a;

    move-result-object p1

    return-object p1
.end method
