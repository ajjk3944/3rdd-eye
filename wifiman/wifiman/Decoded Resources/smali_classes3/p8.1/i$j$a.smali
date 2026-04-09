.class final Lp8/i$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i$j;->a(Lp8/i$b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/i$j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$j$a;

    invoke-direct {v0}, Lp8/i$j$a;-><init>()V

    sput-object v0, Lp8/i$j$a;->a:Lp8/i$j$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lp8/i$b;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lp8/i$b$a;

    sget-object v0, LLe/a$a$e;->a:LLe/a$a$e;

    invoke-direct {p1, v0}, Lp8/i$b$a;-><init>(LLe/a$a;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lp8/i$j$a;->a(Ljava/lang/Long;)Lp8/i$b;

    move-result-object p1

    return-object p1
.end method
