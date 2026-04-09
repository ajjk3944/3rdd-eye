.class public abstract synthetic Lw8/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw8/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:Lfh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LIa/a$b;->values()[LIa/a$b;

    move-result-object v0

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lw8/t$a;->a:Lfh/a;

    return-void
.end method
