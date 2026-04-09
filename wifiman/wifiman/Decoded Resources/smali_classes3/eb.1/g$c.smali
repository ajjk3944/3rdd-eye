.class public interface abstract Leb/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/g$c$a;,
        Leb/g$c$b;
    }
.end annotation


# static fields
.field public static final a:Leb/g$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Leb/g$c$a;->a:Leb/g$c$a;

    sput-object v0, Leb/g$c;->a:Leb/g$c$a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;ZJ)Lgg/z;
.end method

.method public abstract b(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;
.end method

.method public abstract d(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/b;
.end method
